/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.avaliacao.model;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Usuario {
    private String nomeCompleto;
    private String email;
    private String sexo;
    private String estadoCivil;
    private String senha;
    private String telefone;
    private LocalDate dataDeNascimento;
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;

    public Usuario(){
    }
    
    
    
    public Usuario(String nomeCompleto, String email, String sexo, String estadoCivil, String senha, String telefone, LocalDate dataDeNascimento, String rua, String numero, String bairro, String cidade, String uf, String cep) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.senha = senha;
        this.telefone = telefone;
        this.dataDeNascimento = dataDeNascimento;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nomeCompleto=" + nomeCompleto + ", email=" + email + ", sexo=" + sexo + ", estadoCivil=" + estadoCivil + ", senha=" + senha + ", telefone=" + telefone + ", dataDeNascimento=" + dataDeNascimento + ", rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", cidade=" + cidade + ", uf=" + uf + ", cep=" + cep + '}';
    }
    
    
    
}
