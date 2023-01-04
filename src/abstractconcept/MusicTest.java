package abstractconcept;

abstract class Instrument {
    abstract void play();
}

class Piano extends Instrument {
    @Override
    public void play() {
        System.out.println("Piano is playing tan tan tan");
    }
}

class Flute extends Instrument {
    @Override
    public void play() {
        System.out.println("Flute is playing toot toot toot");
    }
}

class Guitar extends Instrument {
    @Override
    public void play() {
        System.out.println("Guitar is playing tin tin tin");
    }
}

public class MusicTest {
    public static void main(String[] args) {
        Instrument[] ins = new Instrument[10];
        ins[0] = new Piano();
        ins[1] = new Guitar();
        ins[2] = new Flute();
        ins[3] = new Piano();
        ins[4] = new Guitar();
        ins[5] = new Flute();
        ins[6] = new Piano();
        ins[7] = new Guitar();
        ins[8] = new Flute();
        ins[9]=new Flute();
        for(int i=0;i<ins.length;i++)
        {
            if(ins[i]instanceof Piano)
            {
                ins[i].play();
            }
            if(ins[i]instanceof Guitar)
            {
                ins[i].play();
            }
            if(ins[i]instanceof Flute)
            {
                ins[i].play();
            }
        }

    }
}
