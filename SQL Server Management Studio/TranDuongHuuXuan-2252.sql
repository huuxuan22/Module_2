create database TRAN_XUAN2252;
go
use TRAN_XUAN2252;

-- tạo bảng nhà cung cấp 
create table NhaCungCap(
	maNCC int primary key,
	tenNCC nvarchar(50),
	diachiNCC nvarchar(50),
	SDT char(10)unique,
	nhanVienLienHe nvarchar(50)
);

--tạo bảng Khách hàng 
create table KhachHang(
	maKH int primary key,
	tenKH nvarchar(50),
	diachiKH nvarchar(50),
	SDT char(50) unique,
	Email varchar(50),
	soDuTaiKhoan money,
	constraint checkSoDuTaiKhoan check ( soDuTaiKhoan > 0)
);

-- tạo bangr nhân viên 
create table NhanVien(
	maNV int primary key,
	tenNV nvarchar(50),
	SDT char(10) unique,
	EMAIL varchar(50),
	gioiTinh BIT default 'F',
	DoB Date,
	Salary money,
	constraint checkSalary check ( Salary > 0),
	-- bài 1 và bài 3
	constraint checkEmailFormat
	check (
		EMAIL LIKE '[a-z A-Z%@%]'
			and (
			   EMAIL like '%@gmail.com'
			   or EMAIL like '%yahoo.com'
			   or EMAIL like '%ute.udn.vn'
			   )
			),
		constraint checkGioiTinh check ( gioiTinh in('T','F')),
		--baì 4
		constraint checkAge check (datediff(year,DoB,getDate()) >= 18),

);


-- tạo bảng Sản phẩm 
create table SanPham(
	maSP char(7) primary key,
	tenSP nvarchar(50),
	donGiaBan money,
	soLUongHienCo bigint,
	soLuongCanDuoi smallint,
	constraint checkSoLuong check ( soLUongHienCo > 0 and soLuongCanDuoi > 0)
);

-- tạo bảng Phiếu nhập
create table PhieuNhap(
	maPN char(7) primary key,
	ngayNhapHang date,
	maNCC int,
	foreign key(maNCC) references NhaCungCap(maNCC)
);

-- tạo bảng Đơn đã đặt hóa đơn
create table DonDatHang_HoaDon(
	maDH int primary key,
	ngayTaoDH date,
	diaChiGiaoHang date,
	SDTGiaoHang char(10),
	naHoaDonDienTu varchar(10),
	ngayThanhToan date,
	ngayGiaoHang date,
	trangThaiDonHang varchar(2) default 'BT',
	maKH int,
	maNV int,
	foreign key (maKH) references KhachHang(maKH),
	foreign key (maNV) references NhanVien(maNV),
	constraint checkNgayTaoDH check ( ngayTaoDH <= getDate()),
	constraint checkTrangThai check ( trangThaiDonHang in ('ER','BT','LL'))
);

--taoj banrg chi tieets phieeus nhaapj
create table ChiTietPhieuNhap(
	maPN char(7),
	maSP char(7),
	primary key (maSP,maPN),
	soLuongNhap int,
	giaNhap money,
	foreign key(maSP) references PhieuNhap(maPN),
	foreign key(maSP) references SanPham(maSP),
	constraint checkSoLuong1 check (soLuongNhap > 0)
);

-- tạo bảng chi tiết đơn hàn g
create table ChiTietDonHang (
	maDH int,
	maSP char(7),
	primary key (maDH,maSP),
	soLuongDat int,
	donGia money,
	foreign key(maDH) references DonDatHang_HoaDon(maDH),
	foreign key(maSP) references SanPham(maSP),
	constraint checkSoLuong2 check (soLuongDat > 0 and donGia > 0)
);