#Nome: Juliana de Melo Teixeira
#Resolucao da questao 1 da lista 1 com escalabilidade utilizando threads.
import socket
import sys

def main():
    soc = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    host = "127.0.0.1"
    port = 14566

    try:
        soc.connect((host, port))
    except:
        print("Erro de conexao")
        sys.exit()

    while True:
		print("Utilize Ctrl+Z para finalizar conexao")
		print ("Nome:")
		aux = raw_input()
		print ("Cargo:")
		aux1 = raw_input()
		print ("Salario:")
		aux2 = raw_input()
		
		message = aux2+':'+aux1
		
		message.encode()
		soc.send(message)
	
		message = soc.recv(1024)
	
		if not message:
			print ("Sem resposta do servidor")
		else:
			print (message)

    soc.send(b'--quit--')

if __name__ == "__main__":
    main()

