/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famela.peminjaman.service.repository;

import com.famela.peminjaman.service.entity.Peminjaman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP
 */
@Repository
public interface PeminjamanRepository extends JpaRepository<Peminjaman, Long> {
    public Peminjaman findByPeminjamanId(Long peminjamanId);

    public Peminjaman save(Peminjaman peminjaman);

    public Peminjaman findByPeminjamanId(Peminjaman peminjaman);
  
}
    

