/*
Neste código, temos uma classe Rectangle que possui atributos width e height,
além de métodos para definir esses valores e calcular a área. 
A classe Square herda da classe Rectangle e sobrescreve os métodos setWidth() e setHeight() 
para garantir que o quadrado sempre tenha lados iguais.
No entanto, essa implementação viola o Princípio de Liskov, 
pois o comportamento esperado de um retângulo é diferente do comportamento esperado de um quadrado. 
Por exemplo, se tentarmos definir a largura e a altura de um objeto Square de forma independente, 
o resultado será inconsistente.
*/ 
public class Square implements Shape {
    protected int sideLength;

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public int calculateArea() {
        return sideLength * sideLength;
    }
}