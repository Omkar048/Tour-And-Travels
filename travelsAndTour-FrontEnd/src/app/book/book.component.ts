import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router, RouterLink } from '@angular/router';
import { Booking } from '../models/booking';
import { BookingService } from '../servicess/booking.service';

@Component({
  selector: 'app-book',
  standalone: true,
  imports: [RouterLink,CommonModule,FormsModule],
  templateUrl: './book.component.html',
  styleUrl: './book.component.css'
})
export class BookComponent {
  submitdata(regForm:any){
    if(regForm.valid)
    {
      this.bs.insert(this.b).subscribe((data:Booking)=>{
       if(data!=null)
        alert("Booking SuccessFull") 
      this.router.navigate(["/hm"]) 

      })
    }
    else
   alert("plese input valid data")
  }
  b:Booking=new Booking()
  constructor(private bs:BookingService,private router:Router)
  {

  }
}
