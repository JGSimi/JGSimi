package com.interfaceapp.Model;

/// @module Representa uma pessoa do sistema
// @field getNome() Retorna o nome da pessoa
// @field getCpf() Retorna o CPF da pessoa
// @field getTelefone() Retorna o telefone da pessoa
// @field getEmail() Retorna o email da pessoa
// @field getSenha() Retorna a senha da pessoa
// @field setNome(nome) Define o nome da pessoa
// @field setCpf(cpf) Define o CPF da pessoa
// @field setTelefone(telefone) Define o telefone da pessoa
// @field setEmail(email) Define o email da pessoa
// @field setSenha(senha) Define a senha da pessoa
// @author Joao

public class Pessoa {
    
    private String nome; // NOME da pessoa
    private String cpf; // CPF da pessoa
    private String telefone; // TELEFONE da pessoa
    private String email; // EMAIL da pessoa
    private String senha; // SENHA da pessoa
    
    /**
     * Construtor da classe Pessoa.
     * @param nome Nome da pessoa
     * @param cpf CPF da pessoa
     * @param telefone Telefone da pessoa
     * @param email Email da pessoa
     * @param senha Senha da pessoa
     */
    public Pessoa(String nome, String cpf, String telefone, String email, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }
    
    // Getters
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getTelefone() { return telefone; }
    public String getEmail() { return email; }
    public String getSenha() { return senha; }

    // Setters
    public void setNome(String nome) { this.nome = nome; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public void setEmail(String email) { this.email = email; }
    public void setSenha(String senha) { this.senha = senha; }
}