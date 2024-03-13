public class ChallangeThree {
  public static void main(String[] args) {
    int[] sequenceA = {1, 3, 5, 7};
    System.out.println("Próximo elemento da sequência a): " + nextElement(sequenceA));
    
    int[] sequenceB = {2, 4, 8, 16, 32, 64};
    System.out.println("Próximo elemento da sequência b): " + nextElement(sequenceB));
    
    int[] sequenceC = {0, 1, 4, 9, 16, 25, 36};
    System.out.println("Próximo elemento da sequência c): " + nextElement(sequenceC));
    
    int[] sequenceD = {4, 16, 36, 64};
    System.out.println("Próximo elemento da sequência d): " + nextElement(sequenceD));

    int[] sequenceE = {1, 1, 2, 3, 5, 8};
    System.out.println("Próximo elemento da sequência e): " + nextElement(sequenceE));

    int[] sequenceF = {2, 10, 12, 16, 17, 18, 19};
    System.out.println("Próximo elemento da sequência f): " + nextElement(sequenceF));
  }

  public static int nextElement(int[] sequence) {
    int lastElement = sequence[sequence.length - 1];
    int secondLastElement = sequence[sequence.length - 2];
    
    int difference = lastElement - secondLastElement;
    
    return lastElement + difference;
  }
}
