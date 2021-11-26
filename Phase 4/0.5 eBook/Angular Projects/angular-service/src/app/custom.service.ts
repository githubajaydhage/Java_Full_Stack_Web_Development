import { Injectable } from "@angular/core";

@Injectable()
export class CustomService {
    sayHello() : string {
        return "Welcome to Angular service with DI";
    }
}