/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.farid.mahasiswa.service.repository;

import com.farid.mahasiswa.service.entity.Mahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ASUS
 */
@Repository
public interface MahasiswaRepository extends JpaRepository<Mahasiswa, Long>{
    public Mahasiswa findByMahasiswaNIM(Long mahasiswaNIM);
}
