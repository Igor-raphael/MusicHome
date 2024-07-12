# 🔊 MusicHome

Esse projeto tem o foco na reprodução de qualquer áudio sendo ".wav" em terminal.

## Configuração do Projeto

### Pré-requisitos

- Java 17 ou superior
- IDE de sua preferência

### Instalação
**1.** Clone o repositório

```bash
   https://github.com/Igor-raphael/MusicHome.git
   ```

**2.** Coloque uma música ".wav" na pasta do projeto e coloque o nome do música no lugar de **Nome da musica**:

```java
  Musica musica1 = new Musica("Nome da musica.wav");
```

2. Da mesma forma sera para o uso da função Podcast mas sera necessário o nome do apresentador:

    ```java
    Podcast meuPodcast = new Podcast("Nome do PODCAST.wav", "Nome do apresentador");
    ```
**3.** Use a IDE para executar o programa. 

## Funcionalidades

1. **Reproduzir Áudio**: O programa vai reproduzir qualquer áudio desde que seja ".WAV" e que tenha sua localização na pasta do projeto.
2. **Gostei**: É possivel usar a função Like para mostrar que gostou da Música ou Podcast.
3. **Favoritos**: É uma função que tem como base os likes no áudio que retornara uma frase da situação do mesmo.
4. **Informações**: Função simples com foco em retornar algumas informações do áudio.
