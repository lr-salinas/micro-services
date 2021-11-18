export class Sale{

  saleId:number=0;
  productId: number=0;
  customerId: number=0;
  quantity: number=0;
  status: boolean=true;

  constructor(saleId:number,productId:number,customerId:number,quantity:number,status:boolean) {
    this.saleId=saleId;
    this.productId=productId;
    this.customerId=customerId;
    this.quantity=quantity;
    this.status=status;
  }
}
