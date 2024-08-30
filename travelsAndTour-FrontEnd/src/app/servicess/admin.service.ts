import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Admin } from '../models/admin';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AdminService {
serverurl="http://localhost:8080/tour"
  constructor(private http:HttpClient) { }
  getAll():Observable<Admin[]>
  {
    return this.http.get<Admin[]>(this.serverurl+"/admin")
  }
  insert(a:Admin):Observable<Admin>
  {
    return this.http.post<Admin>(this.serverurl+"/admin",a)
  }
  delete(id:any):Observable<any>
  {
    return this.http.delete(this.serverurl+"/admin/"+id)
  }
update(id:any,a:Admin):Observable<Admin>
{
  return this.http.put<Admin>(this.serverurl+"/admin/"+id,a)
}
login(em:any,pas:any):Observable<Admin>
{
  return this.http.get<Admin>(this.serverurl+"/admin/"+em+"/"+pas)
}
}
