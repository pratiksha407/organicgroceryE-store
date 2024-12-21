import { Component } from '@angular/core';
import { Feedback } from '../models/feedback';
import { FormsModule } from '@angular/forms';
import { observableToBeFn } from 'rxjs/internal/testing/TestScheduler';
import { FeedbackService } from '../services/feedback.service';

@Component({
  selector: 'app-feedback',
  imports: [FormsModule],
  templateUrl: './feedback.component.html',
  styleUrl: './feedback.component.css'
})
export class FeedbackComponent {
  fd:Feedback=new Feedback()

  constructor(private fdserve:FeedbackService){

  }
 
submitdata()
{
  this.fd.emailid=localStorage.getItem("emailid")
 this.fdserve.savefeedback(this.fd) .subscribe(data=>{
  if(data!=null)
    alert("Thank You For Valuable Feedback")
 })
}
}
