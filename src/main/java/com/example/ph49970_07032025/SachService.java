package com.example.ph49970_07032025;

public class SachService {
    public void suaSach(Sach sach, String tenMoi, String tacGiaMoi, int namMoi, float giaMoi) {
        if (tenMoi != null && !tenMoi.isEmpty()) {
            sach.setTenSach(tenMoi);
        }
        if (tacGiaMoi != null && !tacGiaMoi.isEmpty()) {
            sach.setTacGia(tacGiaMoi);
        }
        if (namMoi > 0 ){
            sach.setNamXuatBan(namMoi);
        }
        if (giaMoi > 0 ){
            sach.setGia(giaMoi);
        }
    }
}
