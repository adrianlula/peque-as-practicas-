package ejercicio2;

import java.io.*;
import java.net.*;

class tcpcliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        String frase;
        String fraseModificada;
        
        BufferedReader entradaDesdeUsuario = new BufferedReader(new InputStreamReader(System.in));
        
        Socket socketCliente = new Socket("localhost", 6789);
        
        DataOutputStream salidaAServidor = 
                new DataOutputStream(socketCliente.getOutputStream());
        
        BufferedReader entradaDesdeServidor = 
                new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));
        
        frase = entradaDesdeUsuario.readLine();
        
        salidaAServidor.writeBytes(frase + '\n');
        
        fraseModificada = entradaDesdeServidor.readLine();
        
        System.out.println("DEL SERVIDOR: " + fraseModificada);
        
        socketCliente.close();
        
    }
    
}
