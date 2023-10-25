create database TRAN_XUAN2252;
go
use TRAN_XUAN2252;
go
-- tạo bảng nhà cung cấp 
create table NhaCungCap(
	maNCC varchar(7) primary key,
	tenNCC nvarchar(50),
	diachiNCC nvarchar(50),
	SDT char(10) unique,
	nhanVienLienHe nvarchar(50)
);

-- tạo bảng Khách hàng 
create table KhachHang(
	maKH varchar(14) primary key,
	tenKH nvarchar(50),
	diachiKH nvarchar(50),
	SDT char(10) unique,
	Email varchar(50),
	soDuTaiKhoan money,
);

-- tạo bảng Nhân viên 
create table NhanVien(
	maNV varchar(14) primary key,
	tenNV nvarchar(50),
	SDT char(10) unique,
	EMAIL varchar(50),
	gioiTinh BIT,
	DoB Date,
	Salary money,
	-- Bạn có thể thêm ràng buộc check email sau dấu "," ở đây
	constraint checkEmailFormat
	check (
		EMAIL LIKE '%@%'
		and (
			EMAIL LIKE '%@gmail.com'
			or EMAIL LIKE '%@yahoo.com'
			or EMAIL LIKE '%@ute.udn.vn'
		)
	),
	constraint checkGioiTinh check (gioiTinh in ('T', 'F')),
	-- Bạn có thể thêm ràng buộc check Age sau đây
	constraint checkAge check (datediff(year, DoB, getDate()) >= 18)
);

-- tạo bảng Sản phẩm 
create table SanPham(
	maSP char(7) primary key,
	tenSP nvarchar(50),
	donGiaBan money,
	soLUongHienCo bigint,
	soLuongCanDuoi smallint,
);

-- tạo bảng Phiếu nhập
create table PhieuNhap(
	maPN char(7) primary key,
	ngayNhapHang date,
	maNCC varchar(7),
	-- Thêm ràng buộc ngoại ở đây
	foreign key (maNCC) references NhaCungCap(maNCC)
);

-- tạo bảng Đơn đã đặt hóa đơn
create table DonDatHang_HoaDon(
	maDH varchar(7) primary key,
	ngayTaoDH date,
	diaChiGiaoHang nvarchar(50),
	SDTGiaoHang char(10),
	naHoaDonDienTu varchar(10),
	ngayThanhToan date,
	ngayGiaoHang date,
	trangThaiDonHang varchar(2) default 'BT',
	maKH varchar(14),
	maNV varchar(14),
	-- Thêm ràng buộc ngoại ở đây
	foreign key (maKH) references KhachHang(maKH),
	foreign key (maNV) references NhanVien(maNV)
);

-- tạo bảng chi tiết phiếu nhập
create table ChiTietPhieuNhap(
	maPN char(7),
	maSP char(7),
	primary key (maSP, maPN),
	soLuongNhap int,
	giaNhap money,
	-- Thêm ràng buộc ngoại ở đây
	foreign key (maPN) references PhieuNhap(maPN),
	foreign key (maSP) references SanPham(maSP),
	-- Thêm ràng buộc check số lượng ở đây
	constraint checkSoluong1 check (soLuongNhap > 1)
);

-- tạo bảng chi tiết đơn hàng
create table ChiTietDonHang (
	maDH varchar(7),
	maSP char(7),
	primary key (maDH, maSP),
	soLuongDat int,
	donGia money,
	-- Thêm ràng buộc ngoại ở đây
	foreign key (maSP) references SanPham(maSP),
	foreign key (maDH) references DonDatHang_HoaDon(maDH),
	-- Thêm ràng buộc check số lượng ở đây
	constraint checkSoLuong2 check (soLuongDat > 0 and donGia > 0)
);

	
																																		   