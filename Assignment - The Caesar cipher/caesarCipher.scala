object caesarCipher extends App{
    //the usual alphabet
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    //function for encryption. Pure function is implemented to handle spaces,uppercase, lower cases
    def encrypt(c:Char,key:Int,a:String):Char=c match{

        case x if x.isUpper => a((a.indexOf(c)+key)%a.size)
        case x if x.isLower => a((a.indexOf(c.toUpper)+key)%a.size).toLower
        case _ => ' '                   
    }
    //function for decryption. Pure function is implemented to handle spaces,uppercase, lower cases
    def decrypt(c:Char,key:Int,a:String):Char=c match{

        case x if x.isUpper => a((a.indexOf(c)-key+26)%a.size)
        case x if x.isLower => a((a.indexOf(c.toUpper)-key+26)%a.size).toLower
        case _ => ' '                   
    }
    //function to implement cipher mapping with given string
    val cipher=(alg:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>
                s.map(alg(_,key,a))

    //USER INPUT
    println("Enter sentence :");
    val user=scala.io.StdIn.readLine();
    println("\n");

    println("Enter key to shift :");
    val shift=scala.io.StdIn.readInt();
    println("\n");

    //Print Encryption
    println("Encryption:");
    println(cipher(encrypt,user,shift,alphabet)+"\n");
    
    //Print Decryption
    println("Decryption :");
    println(cipher(decrypt,user,shift,alphabet)+"");

}