// This class is responsible to map the json data
export class Product {
    constructor(
        public id:number,
        public title:string,
        public price:number,
        public description:string,
        public category:string,
        public image:string,
        public rating:Rate){

        }
}


export class Rate {
    constructor(public rate:number,
        public count:number){}
}