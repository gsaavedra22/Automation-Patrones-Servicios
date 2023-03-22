import { Page } from "@playwright/test";
export class FiltersFlight{
 
    readonly page: Page;

    constructor(page: Page) {
        this.page = page;
    }
}