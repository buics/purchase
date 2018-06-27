<template>
    <div>
        <app-header quote="Purchase Quotation"></app-header>
        <div class="card">
            <div class="card-header">
                <strong class="card-title">Create Purchase Quotation</strong>
            </div>
            <div class="card-body card-block">
                <div class="row form-group">
                    <div class="col col-md-2" >
                        <label for="text-input" class=" form-control-label">Vendor</label>
                    </div>
                    <div class="col-12 col-md-5" >
                        <input v-model="pQuotation.vendor" type="text" id="text-input" name="vendor" placeholder="Text" class="form-control">
                    </div>
                    <div class="col col-md-2" >
                        <label for="text-input" class=" form-control-label">Posting Date</label>
                    </div>
                    <div class="col-12 col-md-3" >
                        <input v-model="pQuotation.postDate" type="date" id="date-input" name="postingdate" placeholder="Text" class="form-control">
                    </div>
                </div>
                <div class="row form-group">
                    <div class="col col-md-2" >
                        <label for="text-input" class=" form-control-label">Name</label>
                    </div>
                    <div class="col-12 col-md-5" >
                        <input type="text" disabled id="text-input" name="name" placeholder="Text" class="form-control">
                    </div>
                    <div class="col col-md-2" >
                        <label for="text-input" class=" form-control-label">Valid Until</label>
                    </div>
                    <div class="col-12 col-md-3" >
                        <input v-model="pQuotation.validUntildate" type="date" id="date-input" name="validUntil" placeholder="Text" class="form-control">
                    </div>
                </div>
                <div class="row form-group">
                    <div class="col col-md-2" >
                        <label for="text-input" class=" form-control-label">Contact Person</label>
                    </div>
                    <div class="col-12 col-md-5" >
                        <input v-model="pQuotation.cPerson" type="text" id="text-input" name="contactPerson" placeholder="Text" class="form-control">
                    </div>
                    <div class="col col-md-2" >
                        <label for="text-input" class=" form-control-label">Document date</label>
                    </div>
                    <div class="col-12 col-md-3" >
                        <input v-model="pQuotation.docDate" type="date" id="date-input" name="documentDate" placeholder="Text" class="form-control">
                    </div>
                </div>
                <div class="row form-group">
                    <div class="col col-md-2" >
                        <label for="text-input" class=" form-control-label">Buyer</label>
                    </div>
                    <div class="col-12 col-md-5" >
                        <input v-model="pQuotation.buyer" type="text" id="text-input" name="buyer" placeholder="Text" class="form-control">
                    </div>
                    <div class="col col-md-2" >
                        <label for="text-input" class=" form-control-label">Required date</label>
                    </div>
                    <div class="col-12 col-md-3" >
                        <input v-model="pQuotation.requiredDate" type="date" id="date-input" name="requiredDate" placeholder="Text" class="form-control">
                    </div>
                </div>
                <div class="card">
                    <div class="card-header">
                            <strong class="card-title">Contents</strong>
                    </div>
                    <div class="card-body">
                        <!-- Modal Start -->
                        <!-- Button trigger modal -->
                        <div class="text-center" style="padding:10px">
                            <button type="button" class="btn btn-secondary text-center" data-toggle="modal" data-target="#exampleModal">
                                Add New Item
                            </button>
                        </div>
                        <!-- Modal -->
                        <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                            <div class="modal-dialog modal-lg" role="document">
                                <div class="modal-content">
                                <div class="modal-header">
                                    <h5 class="modal-title" id="exampleModalLabel">Add New Item</h5>
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>
                                <div class="modal-body">
                                    <table class="modalTable">
                                        <tr>
                                            <td>Item Number</td>
                                            <td><input type="text" v-model="item.itemNum" id="text-input" name="itemNum" placeholder="Item Number" class="form-control text-center"></td>
                                            <td></td>
                                            <td></td>
                                        </tr>
                                        <tr>
                                            <td>Required Date</td>
                                            <td><input v-model="item.reqDate" type="date" id="date-input" name="reqDate" placeholder="Required Date" class="form-control text-center"></td>
                                        
                                            <td>Quoted Date</td>
                                            <td><input v-model="item.quoDate" type="date" id="date-input" name="quoDate" placeholder="Required Date" class="form-control text-center"></td>
                                        </tr>
                                        <tr>
                                            <td>Required Quantity</td>
                                            <td><input v-model="item.reqQuan" type="number" id="number-input" name="reqQuan" placeholder="Required Quantity" class="form-control text-center"></td>
                                        
                                            <td>Quoted Quantity</td>
                                            <td><input v-model="item.quoQuan" type="number" id="number-input" name="quoQuan" placeholder="Quoted Quantity" class="form-control text-center"></td>
                                        </tr>
                                        <tr>
                                            <td>Unit Price</td>
                                            <td><input type="number" v-model="item.unitPrice" min="1" step="any" id="text-input" name="unitPrice" placeholder="Unit Price" class="form-control text-center"></td>
                                            <td></td><td></td>
                                        </tr>
                                                        </table>
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                    <button type="button" @click="addItems" class="btn btn-primary">Save changes</button>
                                </div>
                                </div>
                            </div>
                        </div>
                        <!-- Modal End -->
                        <!--Table Start -->
                        <div id="table" class="table-editable">
                            <table class="table table-bordered table-responsive-md table-striped text-center">
                                <tr>
                                    <th class="text-center">Item Number</th>
                                    <th class="text-center">Required Date</th>
                                    <th class="text-center">Quoted Date</th>
                                    <th class="text-center">Required Quantity</th>
                                    <th class="text-center">Quoted Quantity</th>
                                    <th class="text-center">Unit Price </th>
                                    <th class="text-center">Remove</th>
                                </tr>
                                <tr v-for="(item,index) in items" :key="index">
                                    <td class="pt-3-half">{{item.itemNum}}</td>
                                    <td class="pt-3-half">{{item.reqDate}}</td>
                                    <td class="pt-3-half">{{item.quoDate}}</td>
                                    <td class="pt-3-half">{{item.reqQuan}}</td>
                                    <td class="pt-3-half">{{item.quoQuan}}</td>
                                    <td class="pt-3-half">{{item.unitPrice}}</td>
                                    <td>
                                        <span class="table-add">
                                            <button type="button" @click="(event) => { removeRow(event, index) }" class="btn btn-danger btn-rounded btn-sm my-0">Remove</button>
                                        </span>
                                    </td>
                                </tr>
                            </table>       
                        </div>
                        <!--Table End-->
                        <!-- Modal -->
                        <div class="modal fade" id="successModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
                            <div class="modal-dialog modal-dialog-centered" role="document">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h5 class="modal-title" id="exampleModalLongTitle">Add New Quotation</h5>
                                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                            <span aria-hidden="true">&times;</span>
                                        </button>
                                </div>
                                    <div class="modal-body text-center">
                                    Quotation Successfully Added!
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-success" data-dismiss="modal">Ok</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- Modal End-->
                    </div> 
                </div>
                <div style="margin-top:15px">
                    <div style="float:left" class="form-group shadow-textarea">
                        <textarea v-model="pQuotation.remarks" class="form-control z-depth-1" id="exampleFormControlTextarea6" rows="3" placeholder="Remarks..."></textarea>
                    </div>
                    <div class="text-center" style="padding:10px;float:right;">
                        <button type="button" @click="addQuotation" class="btn btn-primary text-center">
                            Submit Quotation
                        </button>
                    </div>
                </div>
 
            </div>      
        </div>
    </div>  
</template>

<script>
import Header from './header'
export default {
     data() {
        return {
            User: {
                email: '',
                password: ''
            },
            Users: [],
            pQuotation: {
                vendor: '',
                requestedBy: 'System User',
                ownerName: '',
                cPerson: '',
                postDate: '',
                validUntildate: '',
                requiredDate: '',
                docDate: '',
                buyer: '',
                remarks: '',
                status: 'AC',
                items: []
            },
            item: {
                itemNum: '',
                reqDate: '',
                quoDate: '',
                reqQuan: '',
                quoQuan: '',
                unitPrice: ''
            },
            items: [],
            ndx: 0
        };
    },
    methods: {
        getData(){
            this.$http.get('',)
                .then(Response => {
                    return Response.json();
                })
                .then(data => {{
                    const resultArray = [];
                    for(let key in data){
                        resultArray.push(data[key]);
                    }
                    this.Users = resultArray;
                }})
        },
        submit(){
            //console.log(this.User);
            this.$http.post('',this.User)
                .then(Reponse => {
                    console.log(Response); //Returns error: 'ReferenceError: response is not defined'
                }, error => {
                    console.log(error);
                });


        },
        addQuotation(){
            this.pQuotation.items = this.items;
            this.$http.post('',this.pQuotation)
            .then(Reponse => {
                console.log(Response); //Returns error: 'ReferenceError: response is not defined'
            }, error => {
                console.log(error);
            });
            $('#successModal').modal('show');
        },
        addItems(){
            this.items.push({
                itemNum: this.item.itemNum,
                reqDate: this.item.reqDate,
                quoDate: this.item.quoDate,
                reqQuan: this.item.reqQuan,
                quoQuan: this.item.quoQuan,
                unitPrice: this.item.unitPrice
            });
        },
        removeRow(e,n){
            this.items.splice(n, 1);
            this.ndx--;
        }
    },
    components: {
            appHeader: Header
    }
}
</script>

<style>
    .modalTable {
        margin:auto auto;
    }
    .modalTable td {
        padding: 10px;
    }
    .shadow-textarea textarea.form-control::placeholder {
    font-weight: 300;
    }
    .shadow-textarea textarea.form-control {
    padding-left: 0.8rem;
    }
</style>
