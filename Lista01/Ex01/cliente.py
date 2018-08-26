#Nome: Juliana de Melo Teixeira
#Questao 1 da lista 1
import socket

sock = socket.socket(socket.AF_INET,socket.SOCK_STREAM)

host_name = socket.gethostname() #nome do host
port_number = 12318
print ("The name of local machine",host_name)

host_port_pair = (host_name,port_number) #Tupla

sock.connect(host_port_pair)  #Iniciar conexao TCP

while True:
	
	print ("Nome:")
	aux = raw_input()
	print ("Cargo:")
	aux1 = raw_input()
	print ("Salario:")
	aux2 = raw_input()
	
	
	msg_for_server = aux2+':'+aux1
	
	if not msg_for_server:
		break
	
	msg_for_server.encode()
	sock.send(msg_for_server)
	
	msg_from_server = sock.recv(1024)
	
	if not msg_from_server:
		print ("Sem resposta do servidor")
	else:
		print (msg_from_server)

sock.close()
