package com.apicurso.pontointeligente.services;

import java.util.Optional;

import com.apicurso.pontointeligente.entities.Empresa;

public interface EmpresaService {

	
	/** 
	 * Retorna uma empresa dado um CNPJ
	 * 
	 * @param cnpj
	 * @return Optional<Empresa>
	 */
	Optional<Empresa> buscarPorCnpj(String cnpj);
	
	
	/** 
	 * Cadastra uma empresa
	 * 
	 * @param empresa
	 * @return Empresa
	 */
	Empresa persistir(Empresa empresa);
}
