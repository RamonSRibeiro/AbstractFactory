Abstract Factory em Java

Atividade simples para demonstrar o funcionamento do padrão de projeto Abstract Factory utilizando Java.

Objetivo

Demonstrar como o padrão Abstract Factory permite criar famílias de objetos relacionados sem que o código cliente precise conhecer suas implementações concretas.

Estrutura

O exemplo trabalha com componentes de interface para dois sistemas:

Windows
BotaoWindows
JanelaWindows
Linux
BotaoLinux
JanelaLinux
Principais classes e interfaces
FabricaInterface — define os métodos para criação dos componentes.
FabricaWindows — cria componentes da família Windows.
FabricaLinux — cria componentes da família Linux.
Botao — interface para os botões.
Janela — interface para as janelas.
BotaoWindows / BotaoLinux — implementações de Botao.
JanelaWindows / JanelaLinux — implementações de Janela.
Funcionamento

O código cliente trabalha com a abstração FabricaInterface:

FabricaInterface
       |
   ┌───┴────┐
   ↓        ↓
Windows    Linux
   |        |
   ↓        ↓
Botão +   Botão +
Janela    Janela

Dessa forma, basta escolher a fábrica concreta para determinar qual família de componentes será criada.

Testes

Foram criados testes utilizando JUnit 5 para verificar:

Se FabricaWindows cria BotaoWindows e JanelaWindows.
Se FabricaLinux cria BotaoLinux e JanelaLinux.
Se os componentes criados não são null.

Todos os testes foram executados com sucesso.

Tecnologias
Java
JUnit 5
IntelliJ IDEA
Padrão utilizado

Abstract Factory (Fábrica Abstrata) — padrão criacional utilizado para criar famílias de objetos relacionados sem especificar suas classes concretas diretamente no código cliente.
