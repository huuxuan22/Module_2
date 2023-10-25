insert into TRAN_XUAN2252.dbo.NhaCungCap(maNCC,tenNCC,diachiNCC,SDT,nhanVienLienHe)
values 
	('NCC01',N'Nhà cung cấp Hữu Thành','96 Trương Minh Khải','0909685746',N'Phạm Ngọc Phúc'),
	('NCC02',N'Nhà cung cấp Hữu ','96 Trương Minh Hoàng','0909685746',N'Phạm Ngọc Phúc'),
	('NCC03',N'Nhà cung cấp Thành','96 Trương Minh Dũng','0909685746',N'Phạm Ngọc Phúc'),
	('NCC04',N'Nhà cung cấp xung Thành','96 Trương Minh Khoa','0909685746',N'Phạm Phương Trân'),
	('NCC05',N'Nhà cung cấp Hữu Thành','96 Trương Minh Khải','0909685746',N'Phạm Phương Trân'),
	('NCC06',N'Nhà cung cấp Công Thành','96 Trương Minh Khải','0909685746',N'Phạm Phương Trân'),
	('NCC07',N'Nhà cung cấp Hữu Thành','96 Trương Minh Khải','0909685746',N'Trần Dương Hữu Xuân'),
	('NCC08',N'Nhà cung cấp Minh Thành','96 Trương Minh Khải','0909685746',N'Trần Dương Hữu Xuân'),
	('NCC09',N'Nhà cung cấp Bao Thành','96 Trương Minh Khải','0909685746',N'Trần Dương Hữu Xuân'),
	('NCC10',N'Nhà cung cấp Trình Thành','96 Trương Minh Khải','0909685746',N'Trần Dương Hữu Xuân');

	
insert into TRAN_XUAN2252.dbo.KhachHang(maKH,tenKH,diachiKH,SDT,EMail,soDuTaiKhoan)
values 
	('22115053122142',N'LÊ MINH TOÀN',N'Bình Trung','0707342756','tranhuuxuan17@gmail.com',50000000),
	('22115053122145',N'NGUYỄN MẠNH TUẤN',N'Bình Trung','0707342756','tranhuuxuan17@gmail.com',50000000),
	('22115053122146',N'NGUYỄN NGỌC TUẤN ',N'Bình Trung','0707342756','tranhuuxuan17@gmail.com',50000000),
	('22115053122148',N'NGUYỄN VĂN VIÊN',N'Bình Trung','0707342756','tranhuuxuan17@gmail.com',50000000),
	('22115053122149',N'TRẦN ĐÌNH VIỆT',N'Bình Trung','0707342756','tranhuuxuan17@gmail.com',50000000),
	('22115053122151',N'TRẦN HUỲNH VŨ',N'Bình Trung','0707342756','tranhuuxuan17@gmail.com',50000000),
	('22115053122152',N'NGUYỄN NGỌC VỸ',N'Bình Trung','0707342756','tranhuuxuan17@gmail.com',50000000),
	('22115053122208',N'NGUYỄN VĂN HẢI ',N'Bình Trung','0707342756','tranhuuxuan17@gmail.com',50000000),
	('22115053122218',N'KHƯƠNG NGÂN HUYỀN',N'Bình Trung','0707342756','tranhuuxuan17@gmail.com',50000000),
	('22115053122224',N'NGUYỄN PHƯỚC KỲ',N'Bình Trung','0707342756','tranhuuxuan17@gmail.com',50000000);


insert into TRAN_XUAN2252.dbo.NhanVien(maNV,tenNV,SDT,EMAIL,gioitinh,DoB,Salary)
values 
	('19115053101413',N'NGUYỄN NGỌC PHONG','0707342756','tranduonghuuxuan22@gmail.com',1,2004-12-2,45000000),
	('20505312001424',N'ĐOÀN NGỌC HIẾU','0707342756','tranduonghuuxuan22@gmail.com',1,2004-12-2,45000000),
	('22115053122103',N'TRẦN VĂN BÌNH','0707342756','tranduonghuuxuan22@gmail.com',1,2004-12-02,45000000),
	('22115053122252',N'Trần Dương Hữu Xuân','0707342756','tranduonghuuxuan22@gmail.com',1,2004-12-2,45000000),
	('22115053122115',N'PHẠM THANH HIẾU','0123456789','hieu@gmail.com',0,2004-12-2,230000000),
	('22115053122117',N'PHẠM LÊ VĂN HUY','0123456789','hieu@gmail.com',0,2004-12-2,230000000),
	('22115053122119',N'ĐỖ HÙNG QUỐC KHÁNH','0707342756','tranduonghuuxuan22@gmail.com',1,2004-12-2,45000000),
	('22115053122122',N'TRẦN PHƯỚC LỘC','0707342756','tranduonghuuxuan22@gmail.com',1,2004-12-2,45000000),
	('22115053122124',N'NGUYỄN THỊ BÍCH NGỌC','0123456789','hieu@gmail.com',0,2004-12-2,230000000);

insert into TRAN_XUAN2252.dbo.SanPham(maSP,tenSP,donGiaBan,soLUongHienCo,soLuongCanDuoi)
values 
	('masp001',N'Áo gió',100.0005,500,200),
	('masp002',N'Áo khoác',100.0005,500,200),
	('masp003',N'Áo ấm',100.0005,500,200),
	('masp004',N'quần bò',100.0005,500,200),
	('masp005',N'quần da',100.0005,500,200),
	('masp006',N'Áo thun',100.0005,500,200),
	('masp007',N'Áo ba lỗ',100.0005,500,200),
	('masp008',N'Áo khoác',100.0005,500,200),
	('masp009',N'Áo gió',100.0005,500,200),
	('masp010',N'Áo bóng đá',100.0005,500,200);



insert into TRAN_XUAN2252.dbo.PhieuNhap(maPN,ngayNhapHang,maNCC)
values 
	('maPN001','2004-12-2',),
	('maPN002','2004-2-12'),
	('maPN003','2002-1-2'),
	('maPN004','2003-5-2'),
	('maPN005','2004-1-2'),
	('maPN006','2005-7-2'),
	('maPN007','2007-7-2'),
	('maPN008','2008-7-2'),
	('maPN009','2010-9-2'),
	('maPN010','2022-12-2');

