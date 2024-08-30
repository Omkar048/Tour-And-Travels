import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Admin } from '../models/admin';
import { AdminService } from '../servicess/admin.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-asignup',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './asignup.component.html',
  styleUrl: './asignup.component.css'
})
export class AsignupComponent {
  submitdata(regForm:any){
    if(regForm.valid)
    {
      this.as.insert(this.a).subscribe((data:Admin)=>{
       if(data!=null)
        alert("Registration SuccessFull") 
      this.router.navigate(["/log"]) 

      })
    }
    else
   alert("plese input valid data")
  }
  a:Admin=new Admin()
  constructor(private as:AdminService,private router:Router)
  {

  }
}
