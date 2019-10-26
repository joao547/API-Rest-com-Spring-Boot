package com.produtos.apirest.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
=======
import org.springframework.web.bind.annotation.GetMapping;
>>>>>>> master
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.apirest.apirest.models.Produto;
import com.produtos.apirest.apirest.repository.ProdutoRepository;

<<<<<<< HEAD
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Produtos")
@CrossOrigin(origins="*")
=======
@RestController
@RequestMapping(value="/api")
>>>>>>> master
public class ProdutoResource {
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	@GetMapping("/produtos")
<<<<<<< HEAD
	@ApiOperation(value="Retorna a lista de produtos")
	public List<Produto> listaProdutos(){
		return produtoRepository.findAll();
	}
	
	@GetMapping("/produto/{id}")
	@ApiOperation(value="Retorna um único produto")
	public Produto listaProdutoUnico(@PathVariable(value="id") long id){
		return produtoRepository.findById(id);
	}
	
	@PostMapping("/produto")
	@ApiOperation(value="Salva um produto na lista")
	public Produto salvaProduto(@RequestBody Produto produto){
		return produtoRepository.save(produto);
	}
	
	@DeleteMapping("/produto")
	@ApiOperation(value="Deleta um produto")
	public void deletaProduto(@RequestBody Produto produto){
		produtoRepository.delete(produto);
	}
	
	@PutMapping("/produto")
	@ApiOperation(value="Atualiza um produto")
	public Produto atualizaProduto(@RequestBody Produto produto){
		return produtoRepository.save(produto);
	}
=======
	public List<Produto> listaProdutos(){
		return produtoRepository.findAll();
	}
>>>>>>> master
}
