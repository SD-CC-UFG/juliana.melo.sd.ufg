#Nome: Juliana de Melo Teixeira
#Questao 1 da lista 1
import socket

sock = socket.socket(socket.AF_INET,socket.SOCK_STREAM)

host_name = socket.gethostname() #Pegar nome do host
port_number = 12318

host_port_pair = (host_name,port_number) #Tupla

sock.bind(host_port_pair)

sock.listen(10)
conn_obj,addr = sock.accept()
while True:
	
	msg_from_client = conn_obj.recv(1024)
	if not msg_from_client:
		print ("Sem resposta")
	else:
		 
		msg1 = str (msg_from_client)
		
		msg = msg1.split(':')
		novo_sal = float(msg[0])
		
		if msg[1] == 'operador':
			novo_sal = novo_sal + (0.2*novo_sal)
		elif msg[1] == 'programador':
			novo_sal = novo_sal + (0.18*novo_sal)
		msg = "Novo salario: "+str(novo_sal)
		
		conn_obj.send(msg)
conn_obj.close()	

sock.close()
