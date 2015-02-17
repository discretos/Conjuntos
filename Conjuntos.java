package conjuntos;

import java.util.ArrayList;
import java.util.Scanner;


public class Conjuntos {
    Scanner ler=new Scanner(System.in);
    
    public static boolean pertence(float x,float a[]){
        for(int cont=0;cont<a.length;cont++)
            if(a[cont]==x) return true;
        return false;
    }
    
    public static float[] intercecao(float a[],float b[]){
        ArrayList<Float> inter=new ArrayList<>();
        int i=0;
        boolean jaTestado;
        for(int cont1=0;cont1<a.length;cont1++){
            jaTestado=false;
            for(int cont11=0;cont11<cont1;cont11++){
                if(a[cont1]==a[cont11]){
                    jaTestado=true;
                    break;
                }
            }
            if(jaTestado) continue;
            for(int cont2=0;cont2<b.length;cont2++)
                if(a[cont1]==b[cont2]){
                    inter.add(i++, a[cont1]);
                    break;
                }
        }
        if(i==0){
            System.out.println("Não Existem elementos comuns entre os dois conjuntos");
            return null;
        }
        else{
            float c[]=new float[i];
            for(int cont=0;cont<i;cont++)
                c[cont]=inter.get(cont);
            return c;
        }
        }
    
    public static float[] diferenca(float a[], float b[]){
        ArrayList<Float> difer=new ArrayList<>();
        int i=0;
        boolean jaTestado, naoExiste;
        for(int conta=0;conta<a.length;conta++){
            jaTestado=false;
            for(int conta1=0;conta1<conta;conta1++)
                if(a[conta]==a[conta1]){ 
                    jaTestado=true;
                    break;
                }
            if(jaTestado) continue;
            naoExiste=true;
            for(int contb=0;contb<b.length;contb++){
                if(a[conta]==b[contb]){ 
                    naoExiste=false;
                    break;
                }
            }
            if(naoExiste)
                difer.add(i++,a[conta]);
        }
        //Agora vou adicionar ao ArrayList os elementos de b que não constam em a
        for(int contb=0;contb<b.length;contb++){
            jaTestado=false;
            for(int contb1=0;contb1<contb;contb1++)
                if(b[contb]==b[contb1]){ 
                    jaTestado=true;
                    break;
                }
            if(jaTestado) continue;
            naoExiste=true;
            for(int conta=0;conta<a.length;conta++){
                if(b[contb]==a[conta]){ 
                    naoExiste=false;
                    break;
                }
            }
            if(naoExiste)
                difer.add(i++,b[contb]);
        }
        if(i==0){
            System.out.println("Os conjuntos são iguais");
            return null;
        }
        else{
            float c[]=new float[i];
            for(int cont=0;cont<i;cont++)
                c[cont]=difer.get(cont);
            return c;
        }
    }
    
    public static boolean subConjunto(float a[], float b[]){
        boolean eSubConjunto=false;
        for(int conta=0;conta<a.length;conta++){
            eSubConjunto=false;
            for(int contb=0;contb<b.length;contb++){
                if(a[conta]==b[contb]){
                    eSubConjunto=true;
                    break;
                }
            }
            if(!eSubConjunto) return eSubConjunto;
        }
        return eSubConjunto;
    }
    
    public static int tamanho(float a[]){
        return a.length;
    }
    
    public static boolean iguais(float a[], float b[]){
        boolean constaEmB;
        for(int conta=0;conta<a.length;conta++){
            constaEmB=false;
            for(int contb=0;contb<b.length;contb++){
                if(a[conta]==b[contb]){ 
                    constaEmB=true;
                    break;
                }
            }
            if(!constaEmB) return constaEmB;
        }
        //Agora vou Testar para ver se algum elemento de B não consta em A
        boolean constaEmA=false;
        for(int contb=0;contb<b.length;contb++){
            constaEmA=false;
            for(int conta=0;conta<a.length;conta++){
                if(b[contb]==a[conta]){ 
                    constaEmA=true;
                    break;
                }
            }
            if(!constaEmA) return constaEmA;
        }
        return constaEmA;
    }
    
    
    
    public static void main(String[] args) {
        float y[]={5,3,5,6,7,8,2,1,3,4,5,6,7,8,9};
        float x[]={1,2,3,4,5,6,7,8,9};
        boolean z=iguais(x,y);
       if(z) System.out.println("A e B sao iguais");
       else System.out.println("A e B nao sao iguais");
    }
    
}
