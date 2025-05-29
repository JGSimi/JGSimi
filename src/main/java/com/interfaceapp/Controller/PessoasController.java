package com.interfaceapp.Controller;

import com.interfaceapp.Model.Pessoa;
import java.util.ArrayList;
import java.util.List;

/// @module Controlador de pessoas, gerencia as operacoes CRUD em memoria
// @field salvarPessoa(pessoa) Salva uma pessoa na lista
// @field listarPessoas() Retorna a lista de pessoas cadastradas
// @author Joao

public class PessoasController {
    private List<Pessoa> pessoas; // Lista de pessoas cadastradas

    /**
     * Construtor do controlador de pessoas, inicializa a lista.
     */
    public PessoasController() {
        pessoas = new ArrayList<>();
    }

    /**
     * Salva uma pessoa na lista em memoria.
     * @param pessoa Pessoa a ser salva
     */
    public void salvarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    /**
     * Retorna a lista de pessoas cadastradas.
     * @return List<Pessoa> lista de pessoas
     */
    public List<Pessoa> listarPessoas() {
        return pessoas;
    }
}