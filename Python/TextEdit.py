f = open("Program1py.txt", "rt")
#read file contents to string
data = f.read()
#replace all of the required string
data = data.replace('aa', '0')
data = data.replace('ac', '1')
data = data.replace('ag', '2')
data = data.replace('at', '3')
data = data.replace('ca', '4')
data = data.replace('cc', '5')
data = data.replace('cg', '6')
data = data.replace('ct', '7')
data = data.replace('ga', '8')
data = data.replace('gc', '9')
data = data.replace('gg', 'A')
data = data.replace('gt', 'B')
data = data.replace('ta', 'C')
data = data.replace('tc', 'D')
data = data.replace('tg', 'E')
data = data.replace('tt', 'F')
#close the input file
f.close()
#open the input file in write mode
f = open("Program1py.txt", "wt")
#overrite the input file with the resulting data
f.write(data)
#close the file
f.close()
