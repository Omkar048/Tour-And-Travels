import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router, RouterLink } from '@angular/router';

@Component({
  selector: 'app-navbar',
  standalone: true,
  imports: [CommonModule,RouterLink],
  templateUrl: './navbar.component.html',
  styleUrl: './navbar.component.css'
})
export class NavbarComponent implements OnInit {

logout(){
  localStorage.removeItem("uemail")
  this.router.navigate(["/hm"])
}

  ngOnInit(): void {
   this.router.events.subscribe(()=>{
    let em=localStorage.getItem("uemail")
    if(em!=null)
    {
      this.usertype="user"
    }
    else
    {
    let am=localStorage.getItem("aemail")
    if(am!=null)
    {
    this.usertype="admin"
    }
    else
    {
      this.usertype="guest"
    }

   }
  
  })
}

 usertype="guest"
 constructor(private router:Router)
 {

 }
 alogout(){
  localStorage.removeItem("aemail")
  this.router.navigate(["/hm"])
}

}
