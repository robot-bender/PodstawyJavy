package interfaces;

import inheritance.Memory;
import inheritance.Processor;
import inheritance.SoundCard;
import inheritance.StandardMemory;
import inheritance.StandardProcessor;

import java.util.Optional;


public class Computer implements Electronic {

    private Processor processor;
    private Memory memory;
    private SoundCard soundCard;

    // standard getters/setters/constructors

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(final Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(final Memory memory) {
        this.memory = memory;
    }

    public void setSoundCard(final SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    public Computer() {
    }

    public Computer(final Processor processor, final Memory memory, final SoundCard soundCard) {
        this.processor = processor;
        this.memory = memory;
        this.soundCard = soundCard;
    }

    public Optional<SoundCard> getSoundCard() {
        return Optional.ofNullable(soundCard);
    }

    @Override
    public int getElectricityUse() {
        return 1000;
    }

    private StandardProcessor processor1
            = new StandardProcessor("Intel I3");

    private StandardMemory memory1
            = new StandardMemory("Kingston", "1TB");

    // additional fields / methods
}
