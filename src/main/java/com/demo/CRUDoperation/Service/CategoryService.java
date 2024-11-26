package com.demo.CRUDoperation.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.demo.CRUDoperation.Entity.Category;
import com.demo.CRUDoperation.Entity.Product;
import com.demo.CRUDoperation.Repository.CategoryRepository;
import com.demo.CRUDoperation.Repository.ProductRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;

	public List<Category> getAllCategories() {
		return categoryRepository.findAll();
	}

	public Optional<Category> getCategoryById(Long id) {
		return categoryRepository.findById(id);
	}

	public Category createCategory(Category category) {
		return categoryRepository.save(category);
	}

	public Category updateCategory(Category category) {
		return categoryRepository.save(category);
	}

	public void deleteCategory(Long id) {
		categoryRepository.deleteById(id);
	}

	@Autowired
	ProductRepository productRepository;

	public Product addProductToCategory(Long categoryId, Product product) {
		Category category = categoryRepository.findById(categoryId).orElse(null);
		if (category != null) {
			product.setCategory(category);
			return productRepository.save(product);
		}
		return null;
	}
	

	public List<Product> getProductsByCategoryId(Long categoryId, int page, int size) {
		org.springframework.data.domain.Pageable pageable = PageRequest.of(page, size);
		Page<Product> products = productRepository.findByCategoryId(categoryId, pageable);
		return products.getContent();
	}
}
