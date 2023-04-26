class TipoCaracter{
  public static void main(String[] args){
    
    char i = 'i';
    char a = 'a';
    char asciiI = 73;
    char asciiA = 65; 
    char utf = 0x21;
    char utf2 = 0b00100001;

    System.out.println(i+a+i);
    System.out.println(""+i+a+i);
    System.out.println(asciiI+asciiA+asciiI);
    System.out.println(""+asciiI+asciiA+asciiI+utf+utf2);

  }
}