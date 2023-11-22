/**
 * Neste código, a classe LightSwitch possui uma dependência direta da classe LightBulb. 
 * A criação da instância de LightBulb é feita dentro do construtor de LightSwitch, 
 * o que acopla as duas classes de forma rígida. 
 * Isso viola o Princípio de Inversão de Dependência, pois a classe de alto nível (LightSwitch) 
 * depende de uma classe de baixo nível (LightBulb).
 */
public class LightSwitch {
    private Switchable device;

    public LightSwitch(Switchable device) {
        this.device = device;
    }

    public void press() {
        if (device.isOn()) {
            device.turnOff();
        } else {
            device.turnOn();
        }
    }
}