/**
  *
  * @author (32465092 MSM Dhlamini)
  * @version (17 August 2023)
  */
public class MemoryCard {
    private int value;
    private boolean guessed;

    public MemoryCard(int value) {
        this.value = value;
        this.guessed = false;
    }

    public int getValue() {
        return value;
    }

    public boolean isGuessed() {
        return guessed;
    }

    public void setGuessed(boolean guessed) {
        this.guessed = guessed;
    }

    @Override
    public String toString() {
        if (guessed) {
            return Integer.toString(value);
        } else {
            return " ";
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MemoryCard otherCard = (MemoryCard) obj;
        return value == otherCard.value;
    }
}
