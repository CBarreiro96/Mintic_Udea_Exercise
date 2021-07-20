import csv

department_code = input('WQrite the department code: ')
# Read file
with open('Departamentos_y_municipios_de_Colombia.csv',
          newline='',
          encoding="utf-8") as file:
    Municipality_count = 0
    reader_file = csv.reader(file)
    for i in reader_file:
        if i[1] == department_code:
            Department = i[2]
            break;

    for i in reader_file:
        if i[1] == department_code:
            Municipality_count = Municipality_count + 1

    print(f'You have {Municipality_count} Municipality of {Department} Department')

