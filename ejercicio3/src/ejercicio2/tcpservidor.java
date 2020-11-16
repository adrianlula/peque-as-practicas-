package ejercicio2;
import java.io.*;
import java.net.*;

class tcpServidor {


    public static void main(String[] args) throws Exception {
        
        String fraseCliente;
        String fraseMayusculas;
        
        ServerSocket socketAcogida = new ServerSocket(6789);
        
        while (true) {
            
            Socket socketConexion = socketAcogida.accept();
            
            BufferedReader  entradaDesdeCliente = 
                    new BufferedReader(new InputStreamReader(socketConexion.getInputStream()));
            
            DataOutputStream salidaACliente = new DataOutputStream(socketConexion.getOutputStream());
            
            fraseCliente = entradaDesdeCliente.readLine();
            
            fraseMayusculas = fraseCliente.toUpperCase() + '\n';
            
            salidaACliente.writeBytes(fraseMayusculas);
            
        }
        
    }
    
}