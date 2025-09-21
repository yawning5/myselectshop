package com.sparta.myselectshop.repository;

import com.sparta.myselectshop.dto.ProductResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductFolderRepository extends JpaRepository<ProductResponseDto,Long> {
}
