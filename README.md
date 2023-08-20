# Git Hub e Android Studio
## Utilizações, comandos e usos

O git hub é uma plataforma para a criação de repositórios seguros que impedem a perca de dados e documentos importantes a serem salvos por um usuário. É possível mandar arquivos para o git hub usando tanto sua versão Desktop quanto a versão por linha de comando, que é chamada somente de Git.

Já o Android Studio é uma plataforma para criação de aplicações para dispositivos android, onde se é possível criar telas através de "views" e implementar fucionanalidades a partir da linguagem escolhida (Kotlin ou Java, neste caso, estamos falando da linguagem Java).

### Implementando na prática 
Usamos o Git por linha de comando para enviar os arquivos de uma atividade de fixação feita na linguagem Java pelo Android Studio. 

![Imagem ref ao Git][def]

[def]: image/image.png

```
$Git init - Inicia o repositório no arquivo local selecionado, foi utilizado na pasta exerciciopam
$Git remote add origin - Adiciona a origem remota do repositório. Ex: https://github.com/user/nomerepositorio
$Git Pull--allow-unrelated-histories - Mescla as alterações atuais com as já existentes. Nesse caso, usamos apenas pela lógica, para ter certeza de estarmos fazendo o caminho correto
```
![Imagem ref ao Git][def2]

[def2]: image/image2.png  

```
$Git add <nome do arquivo> - Esse comando foi utilizado adicionar os arquivos selecionados a branch main do repositório. Uma branch é uma ramificação/ligação de código. 
$Git add . - Basicamente, faz o mesmo que o comando de cima, sendo que o ponto é ára simbolizar a adição de todos os arquivos

Obs: Após esse comando é possível observar alguns erros e avisos que a linha de comando nos da, esses erros avisam individualmente quais arquivo não foram possíveis de serem adicionados. 
```
![Imagem ref ao Git][def3]

[def3]: image/image3.png

```
Neste print, nós refizemos alguns dos comandos acima e então realizamos outros. ´

$git status - Usado para definir qual o status atual do repositório, que se encontrava na branch master , que seria a segunda ramificação de código;
$git pull origin main - Usado para mesclar as alterações na ramificação main da branch do repositório. 
$git commit -a -m - Usado para enviar a mensagem de commit junto com os arquivos selecionados.
```
![Imagem ref ao Git][def4]

[def4]: image/image4.png

```
Por fim, uma foto com todos os comandos que foram listados a cima em pleno funcionamento e sem erros de sintax.
```

### Exercícios de Fixação
Dentro da pasta do repositório, foram adicionados arquivos referentes a exercícios de fixação passados em aula para serem implementados no Android Studio.

Os exercícios exolhidos foram o 4 e o 5 respectivamente.

![Exercicio 4 Android Studio][def5]

[def5]: image/imageas1.png

```
TextView - É uma caixa de texto não editável, para mostrar alguma informação para o usuário. Foi usada para dizer qual exercício está sendo feito.
EditText - É uma caixa de texto editável ao qual pode ser atríbuido algum tipo de valor. Ou seja, pode ser apenas numérica, para letras ou para digitar algo. Neste caso foi usada para determinar um número equivalente a uma hora
Button - Botões podem ser usados para passsar para outras telas ou para realizar alguma outra ação de clique. Neste caso, foram usados dois. Um para passar para o próximo exercício e o outro para calcular o resultado.
```
![Exercicio 4 códigos][def6]

Primeiro, fazemos a declaração de cada uma das variáveis que serão utilizadas ao longo do código. 

![Exercicio 4 códigos][def7]

[def7]: image/imageas3.png

Em segundo, há uma estrutura condicional  para garantir que foi informado um horario entre 24-0, outra condição para horarios até 17 que ao receber 6 horas ainda não passa da meia noite onde o horario reseta e mais algumas condições para os valores que ultrapassam a meia noite e devem ser contados como 1, 2, 3... e não como 25, 26, 27 como aconteceria caso só somasse 6 horas.

![Exercício 4 códigos][def13]~

 Por fim, o código do botão para enviar para o outro exercício (o getBaseContext foi usado como substituto do this porque o android n quis reconhecer).

Agora, passando para o exercício 5: 

![Exercício 5 Android Studio][def8]

[def8]: image/imageas5.png

Neste exercício, o valor a ser devolvido nãoa deve possuir o sinal negativo, como uma espécie de inversão. 

```
Os elementos usados em relação ao anterior foram os mesmos, a diferença é que temos três editstext ao invés de apenas uma, para poder demonstrar os números em ordem sequencial. 
Também temos uma textview oculta que demonstra o resultado ao apertar no botão calcular que realizará a ação de clique padrão. 
```
![Exercício 5 códigos][def9]


[def9]: image/imageas6.png

Primeiro, novamente há a declaração das variáveis que serão utilizadas na ActivityView. Para relembrar, uma Activity é a tela onde uma ação está sendo efetuada, as activitys views são as de visualização enquanto as activitys java são o local onde ficam os códigos. 

![Exercício 5 códigos][def10]


[def10]: image/imageas7.png

 Continuando, há  a conexão os elementos e conversão das variaveis para os cálculos. 

 ![Exercício 5 códigos][def11]

[def11]: image/imageas8.png

Aqui são as condições para todos os casos onde alguma das variáveis pode receber um número negativo para desconsidera-la e calcular a soma apenas das variáveis que receberam valores positivos. 

![Exercício 5 códigos][def12]

[def12]: image/imageas9.png

Por fim, o código do botão novamente para enviar para o outro exercício

[def13]: image/imageas4.png
[def6]: image/imageas2.png
