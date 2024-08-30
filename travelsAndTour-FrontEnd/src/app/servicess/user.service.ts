import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../models/user';

@Injectable({
  providedIn: 'root'
})
export class UserService {
serverurl="http://localhost:8080/tour"
  constructor(private http:HttpClient) { }
  getAll():Observable<User[]>
  {
    return this.http.get<User[]>(this.serverurl+"/user")
  }
  insert(u:User):Observable<User>
  {
    return this.http.post<User>(this.serverurl+"/user",u)
  }
  delete(id:any):Observable<any>
  {
    return this.http.delete(this.serverurl+"/user/"+id)
  }
update(id:any,u:User):Observable<User>
{
  return this.http.put<User>(this.serverurl+"/user/"+id,u)
}
login(em:any,pas:any):Observable<User>
{
  return this.http.get<User>(this.serverurl+"/user/"+em+"/"+pas)
}

}
