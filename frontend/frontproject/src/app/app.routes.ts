import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ProductComponent } from './product/product.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { OrderComponent } from './order/order.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { ViewfeedbackComponent } from './viewfeedback/viewfeedback.component';
import { ViewregisterComponent } from './viewregister/viewregister.component';
import { ViewOffersComponent } from './view-offers/view-offers.component';
import { ViewOrderComponent } from './view-order/view-order.component';
import { ContactComponent } from './contact/contact.component';

export const routes: Routes = [
{path:'',component:HomeComponent},
{path:'product',component:ProductComponent},
{path:'register',component:RegisterComponent},
{path:'login',component:LoginComponent},
{path:'contact',component:ContactComponent},
{path:'order',component:OrderComponent},
{path:'adminLogin',component:AdminLoginComponent},
{path:'feedback',component:FeedbackComponent},
{path:'viewfeedback',component:ViewfeedbackComponent},
{path:'viewproduct',component:ViewfeedbackComponent},
{path:'viewregister',component:ViewregisterComponent},
{path:'viewoffers',component:ViewOffersComponent},
{path:'vieworder',component:ViewOrderComponent}
];

