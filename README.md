# Controle de Ponto - Exercícios de Herança e Polimorfismo

## Objetivo
Este projeto tem como objetivo aplicar os conceitos de **Herança**, **Polimorfismo**, **Composição**, manipulação de data/hora com **LocalDate** e **LocalDateTime**, além de demonstrar encapsulamento, boas práticas de código, e a separação em pacotes e modularidade.

## Cenário da Aplicação
O sistema de uma empresa de manufatura precisa de um controle de ponto para registrar as entradas e saídas dos funcionários. O pagamento dos funcionários depende dessas informações, por isso, foi desenvolvido um sistema que, além das classes básicas, implementa o funcionamento de um relógio de ponto. Há três tipos de funcionários no sistema:
- **Gerente**
- **Secretaria**
- **Operador**

A utilização de herança permite que objetos criados a partir das classes específicas sejam tratados como objetos da classe genérica `Funcionario` (polimorfismo), centralizando os métodos que registram entrada e saída no sistema.

## Conteúdo Trabalhado
- **Herança e especialização de classes:** Utilização de classes base (por exemplo, `Funcionario`) e suas especializações (como `Gerente`, `Secretaria` e `Operador`).
- **Polimorfismo:** Uso de listas e métodos que permitem tratar os objetos de forma genérica, independente da especialização.
- **Composição:** A classe `RegistroPonto` compõe um `Funcionario` para associar os dados de ponto com o funcionário.
- **Manipulação de data e hora:** Uso das classes `LocalDate` e `LocalDateTime` para trabalhar com registros de data e hora.
- **Encapsulamento e boas práticas de código:** Atributos privados, utilização de getters e setters, e organização em pacotes.
- **Separação em pacotes e modularidade:** Organização dos arquivos em pacotes (por exemplo, `br.com.controle.modelo`).

## Estrutura do Projeto
O projeto possui os seguintes arquivos:

- **Funcionario.java**  
  Classe base para todos os tipos de funcionários. Contém os atributos `idFunc`, `nome` e `email`.

- **Gerente.java**  
  Subclasse de `Funcionario` com atributos específicos `login` e `senha`.

- **Secretaria.java**  
  Subclasse de `Funcionario` com atributos específicos `telefone` e `ramal`.

- **Operador.java**  
  Subclasse de `Funcionario` com o atributo específico `valorHora`.

- **RegistroPonto.java**  
  Classe responsável pelo registro do ponto do funcionário. Possui os atributos `idRegPonto`, `func` (referência do tipo `Funcionario`), `dataRegistro`, `horaEntrada` e `horaSaida`.  
  Contém o método `apresentarRegistroPonto()` que formata e retorna uma string com os dados do registro.

- **GerenciarControlePonto.java**  
  Classe principal que contém o método `main`. É onde os objetos são instanciados, os registros de entrada e saída são criados, e os dados são apresentados no console.  
  Foram incluídos delays de 1 segundo entre os registros (usando `Thread.sleep`).

## Instruções de Execução
1. **Clonar o repositório:**
   ```bash
   git clone https://github.com/seu-usuario/ControlePonto.git
   cd ControlePonto
   ```

2. **Compilar o projeto: Se estiver utilizando o terminal, certifique-se que o JDK esteja instalado e compile os arquivos:**

```bash
Copiar
Editar
javac br/com/controle/modelo/*.java GerenciarControlePonto.java
```

3. **Executar o projeto:**

```bash
java GerenciarControlePonto
```

## Exemplo de Saída
Ao executar o projeto, o console exibirá registros similares ao exemplo abaixo:

==================================
Funcionário: João Silva
Data de Registro: 15/04/2025
Hora de Entrada: 17:08:57
==================================
Funcionário: Pedro Santos
Data de Registro: 15/04/2025
Hora de Entrada: 17:08:58
==================================
Funcionário: Maria Oliveira
Data de Registro: 15/04/2025
Hora de Entrada: 17:08:59
==================================
Funcionário: João Silva
Data de Registro: 15/04/2025
Hora de Entrada: 17:08:57
Hora de Saída: 17:09:00
==================================
Funcionário: Pedro Santos
Data de Registro: 15/04/2025
Hora de Entrada: 17:08:58
Hora de Saída: 17:09:01
==================================
Funcionário: Maria Oliveira
Data de Registro: 15/04/2025
Hora de Entrada: 17:08:59
Hora de Saída: 17:09:02

## Considerações Finais
Este projeto demonstra na prática o uso dos conceitos de orientação a objetos em Java, permitindo registrar e gerenciar os pontos dos funcionários de maneira modular e orientada ao reuso de código. Sinta-se à vontade para explorar e modificar as classes conforme a necessidade do seu aprendizado!
