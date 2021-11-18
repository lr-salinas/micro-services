export class Customer{
  customerId: number=0;
  name: string="";
  lastName: string ="";
  email: string="";

  constructor(customerId:number,name:string,lastName:string, email: string){
    this.customerId = customerId;
    this.name = name;
    this.lastName = lastName;
    this.email = email;
  }
}
