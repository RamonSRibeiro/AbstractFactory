# Abstract Factory em Java

Atividade simples para demonstrar o funcionamento do padrão de projeto **Abstract Factory** utilizando Java.

## Objetivo

Demonstrar como o padrão Abstract Factory permite criar famílias de objetos relacionados sem que o código cliente precise conhecer suas implementações concretas.

## Estrutura

O exemplo trabalha com componentes de interface para dois sistemas:

- **Windows**
  - `BotaoWindows`
  - `JanelaWindows`
- **Linux**
  - `BotaoLinux`
  - `JanelaLinux`

### Principais classes e interfaces

| Classe/Interface | Responsabilidade |
|---|---|
| `FabricaInterface` | Define os métodos para criação dos componentes |
| `FabricaWindows` | Cria componentes da família Windows |
| `FabricaLinux` | Cria componentes da família Linux |
| `Botao` | Interface para os botões |
| `Janela` | Interface para as janelas |
| `BotaoWindows` / `BotaoLinux` | Implementações de `Botao` |
| `JanelaWindows` / `JanelaLinux` | Implementações de `Janela` |

## Funcionamento

O código cliente trabalha apenas com a abstração `FabricaInterface`, sem conhecer as classes concretas:

```
                 FabricaInterface
                   /          \
                  /            \
         FabricaWindows    FabricaLinux
                |                |
        Botao + Janela    Botao + Janela
        (Windows)          (Linux)
```

Dessa forma, basta escolher a fábrica concreta para determinar qual família de componentes será criada.

## Testes

Foram criados testes utilizando **JUnit 5** para verificar:

- [x] Se `FabricaWindows` cria `BotaoWindows` e `JanelaWindows`
- [x] Se `FabricaLinux` cria `BotaoLinux` e `JanelaLinux`
- [x] Se os componentes criados não são `null`

Todos os testes foram executados com sucesso.

## Tecnologias

- Java
- JUnit 5
- IntelliJ IDEA

## Padrão utilizado

**Abstract Factory** (Fábrica Abstrata) — padrão criacional utilizado para criar famílias de objetos relacionados sem especificar suas classes concretas diretamente no código cliente.
