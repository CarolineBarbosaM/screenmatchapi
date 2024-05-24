package br.com.alura.screenmatchapi.service;

public interface IConverteDados {
    <T> T getData(String json, Class<T> tClass);
}
