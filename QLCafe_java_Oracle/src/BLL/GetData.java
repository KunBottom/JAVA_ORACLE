package BLL;

import DAL.DataAccess;
import java.util.ArrayList;

public class GetData {
    
   
    //<editor-fold defaultstate="collapsed" desc=" Method Show System Oracle ">
    // hiển thị SGA trong oracle
    public ArrayList showSGA()
    {
        DataAccess da = new DataAccess("select * from v$sga");
        return da.QueryTable ();
    }
    
    // hiển thị PGA trong oracle
    public ArrayList showPGA()
    {
        DataAccess da = new DataAccess("select * from dba_hist_pgastat");
        return da.QueryTable ();
    }
    
    // hiển thị process trong oracle
    public ArrayList showProcess()
    {
        DataAccess da = new DataAccess("select * from v$process");
        return da.QueryTable ();
    }
    
    // hiển thị thông tin Instance trong oracle
    public ArrayList showInfoInstance()
    {
        DataAccess da = new DataAccess("select * from v$instance");
        return da.QueryTable ();
    }
    
    // hiển thị thông tin Database trong oracle
    public ArrayList showInfoDatabase()
    {
        DataAccess da = new DataAccess("select * from v$database");
        return da.QueryTable ();
    }
    
    // hiển thị thông tin Datafile trong oracle
    public ArrayList showDataFile()
    {
        DataAccess da = new DataAccess("select * from v$datafile");
        return da.QueryTable ();
    }
    
    // hiển thị thông tin SPFile trong oracle
    public ArrayList showSPFile()
    {
        DataAccess da = new DataAccess("select * from sys.v_$parameter where name = 'spfile'");
        return da.QueryTable ();
    }
    
    // hiển thị thông tin ControlFile trong oracle
    public ArrayList showControlFile()
    {
        DataAccess da = new DataAccess("select * from v$controlfile");
        return da.QueryTable ();
    }
     // hiển thị thông tin tablespaces
    public ArrayList showTablespaces()
    {
        DataAccess da = new DataAccess("select tablespace_name FROM dba_tablespaces");
        return da.QueryTable ();
    }
     // hiển thị thông tin dung lượng trống của table space
    public ArrayList showFreeSpace()
    {
        DataAccess da = new DataAccess("SELECT tablespace_name, SUM(bytes)/1024/1024 \"Free Size (MB)\" FROM dba_free_space GROUP BY tablespace_name");
        return da.QueryTable ();
    }
    // hiển thị thông tin tên và dung lượng
    public ArrayList showNameAndContent()
    {
        DataAccess da = new DataAccess("SELECT tablespace_name, sum(bytes)/1024/1024 AS \"Size (MB)\" FROM dba_data_files GROUP BY tablespace_name");
        return da.QueryTable ();
    }
    public ArrayList showDataFileAndTablespace()
    {
        DataAccess da = new DataAccess("SELECT tablespace_name, file_name, online_status, (bytes)\1024\1024 from dba_data_files");
        return da.QueryTable ();
    }
    //Hiển Thị Thông Tin Hóa Đơn
    public ArrayList showDataHoaDon()
    {
        DataAccess da = new DataAccess("Select * From HoaDon");
        return  da.QueryTable();
    }
     //Hiển Thị Thông Tin Khách Hàng
    public ArrayList showDataKhachHang()
    {
        DataAccess da = new DataAccess("Select * From KhachHang");
        return  da.QueryTable();
    }
     //Hiển Thị Thông Tin Thuc Don
    public ArrayList showDataThuDon()
    {
        DataAccess da = new DataAccess("Select * From ThucDon");
        return  da.QueryTable();
    }
     //Hiển Thị Thông Tin Khuyen Mai
    public ArrayList showDataKhuyenMai()
    {
        DataAccess da = new DataAccess("Select * From KhuyenMai");
        return  da.QueryTable();
    }
     //Hiển Thị Thông Tin Chi tiết hóa đơn
    public ArrayList showDataCTHD()
    {
        DataAccess da = new DataAccess("Select * From Chitiethoadon");
        return  da.QueryTable();
    }
    //Hiển Thị Danh sách người dùng hiển thị với người dùng hiện tại
    public ArrayList showDataALL_User()
    {
        DataAccess da = new DataAccess("SELECT * FROM all_users");
        return  da.QueryTable();
    }
    //<editor-fold defaultstate="collapsed" desc=" Session ">
    //hiển thị thông tin các Session hiện hành
    public ArrayList showSessionCurrent()
    {
        DataAccess da = new DataAccess("Select SADDR ,SID, SERIAL#, AUDSID, USER# ,USERNAME, STATUS, OSUSER,MACHINE, PORT, TERMINAL, PROGRAM, MODULE, TYPE, PREV_EXEC_START  from v$session where USERNAME is not NULL");
        return da.QueryTable();
    } 
    
    //hiển thị thông tin các Session hiện hành
    public ArrayList showProcessOfSession()
    {
        DataAccess da = new DataAccess("select p.pname, s.username, p.username, s.serial#, s.machine, s.program from v$process p, v$session s where s.creator_addr = p.addr");
        return da.QueryTable();
    } 
    //</editor-fold>
    
    //</editor-fold>
    //Hiển Thị Danh Sách Nhân Viên
    public ArrayList showDataALL_Staff()
    {
        DataAccess da = new DataAccess("SELECT * FROM NHANVIEN");
        return  da.QueryTable();
    }
    //Hiển Thị Danh Sách Nguyên Liệu
    public ArrayList showDataALL_Resource()
    {
        DataAccess da = new DataAccess("SELECT * FROM KHONGUYENLIEU");
        return  da.QueryTable();
    }
    //Hiển Thị Danh Sách Phiếu Nhập
    public ArrayList showDataALL_Input()
    {
        DataAccess da = new DataAccess("SELECT * FROM PHIEUNHAP");
        return  da.QueryTable();
    }
    //Hiển Thị Danh Sách Chi Tiết Phiếu Nhập
    public ArrayList showDataALL_InputDetail()
    {
        DataAccess da = new DataAccess("SELECT * FROM CHITIETPHIEUNHAP");
        return  da.QueryTable();
    }
    //Hiển Thị Danh Sách Xuất Nguyên Liệu
    public ArrayList showDataALL_ExportResource()
    {
        DataAccess da = new DataAccess("SELECT * FROM XUATNGUYENLIEU");
        return  da.QueryTable();
    }
    //Hiển Thị Danh Sách Xuất Chi Tiết Phiếu Nhập
    public ArrayList showDataALL_ExportResourceDetail()
    {
        DataAccess da = new DataAccess("SELECT * FROM CHITIETXUAT");
        return  da.QueryTable();
    }
}
