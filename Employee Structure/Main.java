#include<iostream>
		using namespace std;

       struct Employee
       {
              int Id;
              char Name[25];
              int Age;
         	  char desig[25];
              long Salary;
       };

       int main()
       {

              Employee E;         

                    

                    cout << "Enter name: ";
                    cin >> E.Name;
					
         			cout << "\nEnter ID: ";
                    cin >> E.Id;
         
                    cout << "\nEnter age: ";
                    cin >> E.Age;

         			cout << "\nEnter designation: ";
                    cin >> E.desig;			
         
                    cout << "\nEnter Salary: ";
                    cin >> E.Salary;
         		
					cout << "\nEmployee Details";
                    cout << "\nName of the Employee : " << E.Name;
         			 cout << "\nID of the Employee : " << E.Id;
                    cout << "\nAge of the Employee : " << E.Age;
         			cout << "\nDesignation of the Employee : " << E.desig;
                    cout << "\nSalary of the Employee : " << E.Salary;


       }