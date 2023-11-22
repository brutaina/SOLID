/**
 * Neste código, a classe LightSwitch possui uma dependência direta da classe LightBulb. 
 * A criação da instância de LightBulb é feita dentro do construtor de LightSwitch, 
 * o que acopla as duas classes de forma rígida. 
 * Isso viola o Princípio de Inversão de Dependência, pois a classe de alto nível (LightSwitch) 
 * depende de uma classe de baixo nível (LightBulb).
 */
public class LightBulb implements Switchable {
    private boolean isOn;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Light bulb turned on");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Light bulb turned off");
    }

    @Override
    public boolean isOn() {
        return isOn;
    }
}