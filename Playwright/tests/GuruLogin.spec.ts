import {test} from '@playwright/test';
import {GuruLoginPage} from '../src/pages/GuruLoginPage';




test.beforeEach(async({page}) => { 
    await page.goto("http://demo.guru99.com/V4/");

});


test(`Given Necesito logearme
 When ingresar credenciales
 Then visualizo los alojamientos disponibles`,async({page}) => {
    const pageGuru99 = new GuruLoginPage(page);
    await pageGuru99.reservationFlight();

 });






