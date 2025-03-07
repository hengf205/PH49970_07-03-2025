package com.example.ph49970_07032025;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SachServiceTest {
    private SachService sachService = new SachService();
    private Sach sach;

    @BeforeEach
    public void setUp(){
        sach = new Sach("Sach001", "Cong nghe thong tin", "Huy Hoang", 2025, 15000);
        sachService = new SachService();
    }

    @Test
    public void testSuaThongTin_HopLe(){
        sachService.suaSach(sach, "Khoi su doanh nghiep", "Thu Hoai", 2024, 100000);
        assertEquals("Khoi su doanh nghiep", sach.getTenSach());
        assertEquals("Thu Hoai", sach.getTacGia());
        assertEquals(2024, sach.getNamXuatBan());
        assertEquals(100000, sach.getGia());
    }

    @Test
    public void testSuaThongTin_TenSachRong(){
        sachService.suaSach(sach, "", "Thu Hoai", 2024, 100000);
        assertEquals("Cong nghe thong tin", sach.getTenSach());
        assertEquals("Thu Hoai", sach.getTacGia());
        assertEquals(2024, sach.getNamXuatBan());
        assertEquals(100000, sach.getGia());
    }

    @Test
    public void testSuaThongTin_TenTacGiaRong(){
        sachService.suaSach(sach, "Khoi su doanh nghiep", "", 2024, 100000);
        assertEquals("Khoi su doanh nghiep", sach.getTenSach());
        assertEquals("Huy Hoang", sach.getTacGia());
        assertEquals(2024, sach.getNamXuatBan());
        assertEquals(100000, sach.getGia());
    }

    @Test
    public void testSuaThongTin_NamXuatBanBang0(){
        sachService.suaSach(sach, "Khoi su doanh nghiep", "Thu Hoai", 0, 100000);
        assertEquals("Khoi su doanh nghiep", sach.getTenSach());
        assertEquals("Thu Hoai", sach.getTacGia());
        assertEquals(2025, sach.getNamXuatBan());
        assertEquals(100000, sach.getGia());
    }

    @Test
    public void testSuaThongTin_GiaAm(){
        sachService.suaSach(sach, "Khoi su doanh nghiep", "Thu Hoai", 2024, -100000);
        assertEquals("Khoi su doanh nghiep", sach.getTenSach());
        assertEquals("Thu Hoai", sach.getTacGia());
        assertEquals(2024, sach.getNamXuatBan());
        assertEquals(15000, sach.getGia());
    }
}
