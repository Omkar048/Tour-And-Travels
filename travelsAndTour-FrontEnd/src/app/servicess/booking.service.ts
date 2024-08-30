import { Injectable } from '@angular/core';
import { Booking } from '../models/booking';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class BookingService {
serverurl="http://localhost:8080/tour"
  
  constructor(private http:HttpClient) { }
  getAll():Observable<Booking[]>
  {
    return this.http.get<Booking[]>(this.serverurl+"/booking")
  }
  insert(b:Booking):Observable<Booking>
  {
    return this.http.post<Booking>(this.serverurl+"/booking",b)
  }
  delete(id:any):Observable<any>
  {
    return this.http.delete(this.serverurl+"/booking/"+id)
  }
update(id:any,b:Booking):Observable<Booking>
{
  return this.http.put<Booking>(this.serverurl+"/booking/"+id,b)
}
search(id:any):Observable<Booking>
  {
    return this.http.get<Booking>(this.serverurl+"/booking/"+id)
  }
}
