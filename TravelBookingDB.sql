USE [master]
GO
/****** Object:  Database [Presentation]    Script Date: 8/14/2019 4:16:57 PM ******/
CREATE DATABASE [Presentation] ON  PRIMARY 
( NAME = N'Presentation', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL10_50.SQLEXPRESS\MSSQL\DATA\Presentation.mdf' , SIZE = 3072KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'Presentation_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL10_50.SQLEXPRESS\MSSQL\DATA\Presentation_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [Presentation] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [Presentation].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [Presentation] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [Presentation] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [Presentation] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [Presentation] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [Presentation] SET ARITHABORT OFF 
GO
ALTER DATABASE [Presentation] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [Presentation] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [Presentation] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [Presentation] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [Presentation] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [Presentation] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [Presentation] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [Presentation] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [Presentation] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [Presentation] SET  DISABLE_BROKER 
GO
ALTER DATABASE [Presentation] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [Presentation] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [Presentation] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [Presentation] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [Presentation] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [Presentation] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [Presentation] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [Presentation] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [Presentation] SET  MULTI_USER 
GO
ALTER DATABASE [Presentation] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [Presentation] SET DB_CHAINING OFF 
GO
USE [Presentation]
GO
/****** Object:  Table [dbo].[tbl_Cart]    Script Date: 8/14/2019 4:16:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_Cart](
	[billID] [int] IDENTITY(1,1) NOT NULL,
	[userID] [int] NOT NULL,
	[tourID] [int] NOT NULL,
	[number] [int] NOT NULL,
	[price] [float] NOT NULL,
	[total] [float] NOT NULL,
	[isPaid] [int] NOT NULL,
 CONSTRAINT [PK_tbl_Cart] PRIMARY KEY CLUSTERED 
(
	[billID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbl_CartDetail]    Script Date: 8/14/2019 4:16:58 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_CartDetail](
	[BillID] [int] NOT NULL,
	[tourID] [int] NULL,
	[tourName] [nvarchar](50) NULL,
	[vehicle] [nvarchar](50) NULL,
	[checkOutDate] [date] NOT NULL,
	[checkInDate] [date] NULL,
	[DetailID] [int] NOT NULL,
	[desLocation] [nvarchar](50) NOT NULL,
	[depLocation] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_tbl_CartDetail] PRIMARY KEY CLUSTERED 
(
	[DetailID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbl_Customer]    Script Date: 8/14/2019 4:16:58 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_Customer](
	[customerName] [nvarchar](50) NULL,
	[billID] [int] NULL,
	[tourID] [int] NULL,
	[customerID] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[customerID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbl_Tour]    Script Date: 8/14/2019 4:16:58 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_Tour](
	[tourID] [int] IDENTITY(1,1) NOT NULL,
	[tourName] [nvarchar](100) NOT NULL,
	[description] [nvarchar](500) NOT NULL,
	[price] [float] NOT NULL,
	[numberTicket] [int] NOT NULL,
	[vehicle] [nvarchar](50) NOT NULL,
	[isDelete] [bit] NULL,
	[checkOutDate] [date] NOT NULL,
	[checkInDate] [date] NOT NULL,
	[desLocation] [nvarchar](40) NOT NULL,
	[depLocation] [nvarchar](40) NOT NULL,
	[img] [nvarchar](50) NULL,
 CONSTRAINT [PK_tbl_Tour] PRIMARY KEY CLUSTERED 
(
	[tourID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbl_User]    Script Date: 8/14/2019 4:16:58 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_User](
	[userID] [int] IDENTITY(1,1) NOT NULL,
	[username] [varchar](50) NOT NULL,
	[fullname] [nvarchar](50) NOT NULL,
	[password] [varchar](30) NOT NULL,
	[email] [varchar](30) NOT NULL,
	[phone] [varchar](20) NOT NULL,
	[role] [varchar](10) NOT NULL,
	[address] [nvarchar](100) NOT NULL,
	[isDelete] [bit] NOT NULL,
 CONSTRAINT [PK_tbl_Login] PRIMARY KEY CLUSTERED 
(
	[userID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[tbl_Cart] ON 

INSERT [dbo].[tbl_Cart] ([billID], [userID], [tourID], [number], [price], [total], [isPaid]) VALUES (8, 8, 21, 0, 265, 0, 0)
INSERT [dbo].[tbl_Cart] ([billID], [userID], [tourID], [number], [price], [total], [isPaid]) VALUES (9, 8, 23, 16, 550, 2750, 0)
INSERT [dbo].[tbl_Cart] ([billID], [userID], [tourID], [number], [price], [total], [isPaid]) VALUES (10, 8, 21, 7, 265, 1855, 0)
INSERT [dbo].[tbl_Cart] ([billID], [userID], [tourID], [number], [price], [total], [isPaid]) VALUES (11, 3, 23, 10, 550, 5500, 1)
INSERT [dbo].[tbl_Cart] ([billID], [userID], [tourID], [number], [price], [total], [isPaid]) VALUES (13, 3, 24, 70, 200, 3000, 1)
INSERT [dbo].[tbl_Cart] ([billID], [userID], [tourID], [number], [price], [total], [isPaid]) VALUES (14, 3, 21, 26, 265, 2650, 1)
INSERT [dbo].[tbl_Cart] ([billID], [userID], [tourID], [number], [price], [total], [isPaid]) VALUES (23, 26, 23, 20, 550, 11000, 0)
INSERT [dbo].[tbl_Cart] ([billID], [userID], [tourID], [number], [price], [total], [isPaid]) VALUES (24, 3, 21, 1, 275, 275, 0)
INSERT [dbo].[tbl_Cart] ([billID], [userID], [tourID], [number], [price], [total], [isPaid]) VALUES (25, 3, 23, 3, 500, 1500, 0)
INSERT [dbo].[tbl_Cart] ([billID], [userID], [tourID], [number], [price], [total], [isPaid]) VALUES (26, 25, 29, 2, 260, 520, 0)
INSERT [dbo].[tbl_Cart] ([billID], [userID], [tourID], [number], [price], [total], [isPaid]) VALUES (27, 27, 21, 1, 275, 275, 1)
INSERT [dbo].[tbl_Cart] ([billID], [userID], [tourID], [number], [price], [total], [isPaid]) VALUES (29, 27, 30, 12, 123, 1476, 1)
INSERT [dbo].[tbl_Cart] ([billID], [userID], [tourID], [number], [price], [total], [isPaid]) VALUES (30, 28, 36, 5, 125, 250, 1)
SET IDENTITY_INSERT [dbo].[tbl_Cart] OFF
SET IDENTITY_INSERT [dbo].[tbl_Tour] ON 

INSERT [dbo].[tbl_Tour] ([tourID], [tourName], [description], [price], [numberTicket], [vehicle], [isDelete], [checkOutDate], [checkInDate], [desLocation], [depLocation], [img]) VALUES (21, N'Ha Noi - Da Nang', N'no desc', 275, 24, N'airplane', 0, CAST(N'2019-03-18' AS Date), CAST(N'2019-03-13' AS Date), N'Da Nang', N'Ha Noi', N'')
INSERT [dbo].[tbl_Tour] ([tourID], [tourName], [description], [price], [numberTicket], [vehicle], [isDelete], [checkOutDate], [checkInDate], [desLocation], [depLocation], [img]) VALUES (23, N'Ha Noi - Da Nang - TP Ho Chi Minh', N'no desc', 500, 25, N'airplane', 0, CAST(N'2019-03-19' AS Date), CAST(N'2019-03-15' AS Date), N'TP Ho Chi Minh', N'Ha Noi', N'')
INSERT [dbo].[tbl_Tour] ([tourID], [tourName], [description], [price], [numberTicket], [vehicle], [isDelete], [checkOutDate], [checkInDate], [desLocation], [depLocation], [img]) VALUES (24, N'Da Nang - Hue - Quang Binh', N'no desc', 200, 55, N'bus', 0, CAST(N'2019-04-19' AS Date), CAST(N'2019-04-17' AS Date), N'Quang Binh', N'Da Nang', N'')
INSERT [dbo].[tbl_Tour] ([tourID], [tourName], [description], [price], [numberTicket], [vehicle], [isDelete], [checkOutDate], [checkInDate], [desLocation], [depLocation], [img]) VALUES (25, N'Quang Nam - Hue', N'no desc', 25, 25, N'bus', 1, CAST(N'2019-06-04' AS Date), CAST(N'2019-06-10' AS Date), N'Hue', N'Quang Nam', N'')
INSERT [dbo].[tbl_Tour] ([tourID], [tourName], [description], [price], [numberTicket], [vehicle], [isDelete], [checkOutDate], [checkInDate], [desLocation], [depLocation], [img]) VALUES (26, N'Nha Trang - TP Ho Chi Minh', N'no desc', 200, 40, N'train', 1, CAST(N'2019-03-20' AS Date), CAST(N'2019-03-16' AS Date), N'TP Ho Chi Minh', N'Nha Trang', N'')
INSERT [dbo].[tbl_Tour] ([tourID], [tourName], [description], [price], [numberTicket], [vehicle], [isDelete], [checkOutDate], [checkInDate], [desLocation], [depLocation], [img]) VALUES (27, N'TP Ho Chi Minh - BangKok', N'no desc', 600, 70, N'airplane', 1, CAST(N'2019-03-16' AS Date), CAST(N'2019-03-19' AS Date), N'BangKok', N'TP Ho Chi Minh', N'')
INSERT [dbo].[tbl_Tour] ([tourID], [tourName], [description], [price], [numberTicket], [vehicle], [isDelete], [checkOutDate], [checkInDate], [desLocation], [depLocation], [img]) VALUES (28, N'Nha Trang - TP Ho Chi Minh', N'no desc', 125, 30, N'train', 0, CAST(N'2019-03-18' AS Date), CAST(N'2019-03-20' AS Date), N'TP Ho Chi Minh', N'Nha Trang', N'')
INSERT [dbo].[tbl_Tour] ([tourID], [tourName], [description], [price], [numberTicket], [vehicle], [isDelete], [checkOutDate], [checkInDate], [desLocation], [depLocation], [img]) VALUES (29, N'Da Lat - TP Ho Chi Minh', N'no desc', 260, 20, N'bus', 0, CAST(N'2019-03-14' AS Date), CAST(N'2019-03-16' AS Date), N'TP Ho Chi Minh', N'Da Lat', NULL)
INSERT [dbo].[tbl_Tour] ([tourID], [tourName], [description], [price], [numberTicket], [vehicle], [isDelete], [checkOutDate], [checkInDate], [desLocation], [depLocation], [img]) VALUES (30, N'Tour Test', N'no desc', 123, 8, N'taxi', 0, CAST(N'2019-03-30' AS Date), CAST(N'2019-03-29' AS Date), N'Nha Trang', N'TP Ho Chi Minh', N'')
INSERT [dbo].[tbl_Tour] ([tourID], [tourName], [description], [price], [numberTicket], [vehicle], [isDelete], [checkOutDate], [checkInDate], [desLocation], [depLocation], [img]) VALUES (36, N'TP HCM - Da Lat', N'none', 125, 5, N'bus', 0, CAST(N'2019-03-29' AS Date), CAST(N'2019-03-31' AS Date), N'Da Lat', N'TP HCM', NULL)
SET IDENTITY_INSERT [dbo].[tbl_Tour] OFF
SET IDENTITY_INSERT [dbo].[tbl_User] ON 

INSERT [dbo].[tbl_User] ([userID], [username], [fullname], [password], [email], [phone], [role], [address], [isDelete]) VALUES (2, N'a', N'Nguyen Van A', N'1                   ', N'vana@gmail.com                ', N'0121554236          ', N'admin     ', N'AX', 1)
INSERT [dbo].[tbl_User] ([userID], [username], [fullname], [password], [email], [phone], [role], [address], [isDelete]) VALUES (3, N'b', N'Truong Van B', N'13', N'vanb@gmail.com                ', N'12345678       ', N'user', N'5 Ha Noi', 0)
INSERT [dbo].[tbl_User] ([userID], [username], [fullname], [password], [email], [phone], [role], [address], [isDelete]) VALUES (4, N'c', N'Nguyen Tuan Khanh C', N'2                   ', N'c@gmail.com', N'12345               ', N'admin     ', N'd', 1)
INSERT [dbo].[tbl_User] ([userID], [username], [fullname], [password], [email], [phone], [role], [address], [isDelete]) VALUES (8, N'a1', N'Nguyen Truong Sinh', N'a', N'truongsinh@gmail.com', N'0121546789', N'user', N'20 Nguyen Thai Hoc', 1)
INSERT [dbo].[tbl_User] ([userID], [username], [fullname], [password], [email], [phone], [role], [address], [isDelete]) VALUES (9, N'userb', N'Nguyen B', N'1', N'userb@mail.com', N'123-1231231', N'user', N'b', 1)
INSERT [dbo].[tbl_User] ([userID], [username], [fullname], [password], [email], [phone], [role], [address], [isDelete]) VALUES (10, N'user1', N'Hoang Nam', N'123123', N'hoangnam@gmail.com', N'01215794455', N'user', N'1 Hoang Hoa Tham', 0)
INSERT [dbo].[tbl_User] ([userID], [username], [fullname], [password], [email], [phone], [role], [address], [isDelete]) VALUES (11, N'user2', N'Nguyen Hoang An', N'0123', N'user2@gmail.com', N'0121575486', N'user', N'4 Hau Giang, F4, Tan Binh', 1)
INSERT [dbo].[tbl_User] ([userID], [username], [fullname], [password], [email], [phone], [role], [address], [isDelete]) VALUES (18, N'user3', N'Au Manh Huy', N'123', N'user3@gmail.com', N'12345678', N'user', N'5 Truong Dinh', 1)
INSERT [dbo].[tbl_User] ([userID], [username], [fullname], [password], [email], [phone], [role], [address], [isDelete]) VALUES (24, N'mytam', N'Nguyen Thi My Tam', N'123', N'mytam@gmail.com', N'123123123', N'user', N'60 Nguyen Thi Minh Khai', 0)
INSERT [dbo].[tbl_User] ([userID], [username], [fullname], [password], [email], [phone], [role], [address], [isDelete]) VALUES (25, N'hongocha', N'Hồ Ngọc Hà', N'111', N'ha@gmail.com', N'123123123', N'user', N'6 Trường Sơn', 0)
INSERT [dbo].[tbl_User] ([userID], [username], [fullname], [password], [email], [phone], [role], [address], [isDelete]) VALUES (26, N'haanhtuan', N'Ha Anh Tuan', N'123123', N'haanhtuan@gmail.com', N'123-1234567', N'user', N'05 Thai Thi Hoa', 0)
INSERT [dbo].[tbl_User] ([userID], [username], [fullname], [password], [email], [phone], [role], [address], [isDelete]) VALUES (27, N'useruser', N'User Test', N'123123', N'user@gmail.com', N'123-1123123', N'user', N'123 A, C', 0)
INSERT [dbo].[tbl_User] ([userID], [username], [fullname], [password], [email], [phone], [role], [address], [isDelete]) VALUES (28, N'testUser', N'User', N'123123', N'aaaaaaaaa', N'123-1231231', N'user', N'aaaaaaaaa', 0)
INSERT [dbo].[tbl_User] ([userID], [username], [fullname], [password], [email], [phone], [role], [address], [isDelete]) VALUES (29, N'haanhtuan', N'asd', N'123123', N'sdvsd', N'123-1231231', N'user', N'sdvsd', 0)
SET IDENTITY_INSERT [dbo].[tbl_User] OFF
/****** Object:  Index [UniqueBill]    Script Date: 8/14/2019 4:16:58 PM ******/
ALTER TABLE [dbo].[tbl_CartDetail] ADD  CONSTRAINT [UniqueBill] UNIQUE NONCLUSTERED 
(
	[BillID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [dbo].[tbl_Cart]  WITH CHECK ADD  CONSTRAINT [FK_tbl_Cart_tbl_Tour] FOREIGN KEY([tourID])
REFERENCES [dbo].[tbl_Tour] ([tourID])
GO
ALTER TABLE [dbo].[tbl_Cart] CHECK CONSTRAINT [FK_tbl_Cart_tbl_Tour]
GO
ALTER TABLE [dbo].[tbl_Cart]  WITH CHECK ADD  CONSTRAINT [FK_tbl_Cart_tbl_User] FOREIGN KEY([userID])
REFERENCES [dbo].[tbl_User] ([userID])
GO
ALTER TABLE [dbo].[tbl_Cart] CHECK CONSTRAINT [FK_tbl_Cart_tbl_User]
GO
ALTER TABLE [dbo].[tbl_CartDetail]  WITH CHECK ADD  CONSTRAINT [FK_tbl_CartDetail_tbl_Cart] FOREIGN KEY([BillID])
REFERENCES [dbo].[tbl_Cart] ([billID])
GO
ALTER TABLE [dbo].[tbl_CartDetail] CHECK CONSTRAINT [FK_tbl_CartDetail_tbl_Cart]
GO
ALTER TABLE [dbo].[tbl_Customer]  WITH CHECK ADD  CONSTRAINT [FK_tbl_Customer_tbl_Cart] FOREIGN KEY([billID])
REFERENCES [dbo].[tbl_Cart] ([billID])
GO
ALTER TABLE [dbo].[tbl_Customer] CHECK CONSTRAINT [FK_tbl_Customer_tbl_Cart]
GO
USE [master]
GO
ALTER DATABASE [Presentation] SET  READ_WRITE 
GO
